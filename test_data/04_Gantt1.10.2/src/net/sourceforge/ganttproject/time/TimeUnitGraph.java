package net.sourceforge.ganttproject.time;

import net.sourceforge.ganttproject.time.TimeUnit;

import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * @author bard
 * Date: 01.02.2004
 */
public class TimeUnitGraph {
    private Map myUnit2compositions = new HashMap();

    public TimeUnit createAtomTimeUnit(String name) {
        TimeUnit result = new TimeUnitImpl(name, this, null);
        List compositions = new ArrayList();
        compositions.add(new Composition(result, 1));
        myUnit2compositions.put(result, compositions);
        return result;
    }

    TimeUnit createTimeUnit(String name, TimeUnit atomUnit, int count) {
        TimeUnit result = new TimeUnitImpl(name, this, atomUnit);
        registerTimeUnit(result, count);
        return result;
    }

    public TimeUnit createDateFrameableTimeUnit(String name, TimeUnit atomUnit, int atomCount, DateFrameable framer) {
        TimeUnit result = new TimeUnitDateFrameableImpl(name, this, atomUnit, framer);
        registerTimeUnit(result, atomCount);
        return result;
    }

    public TimeUnitFunctionOfDate createTimeUnitFunctionOfDate(String name, TimeUnit atomUnit, DateFrameable framer) {
        TimeUnitFunctionOfDate result;
        result = new TimeUnitFunctionOfDateImpl(name, this, atomUnit, framer);
        registerTimeUnit(result, -1);
        return result;
    }

    private void registerTimeUnit(TimeUnit unit, int atomCount) {
        TimeUnit atomUnit = unit.getDirectAtomUnit();
        List transitiveCompositions = (List) myUnit2compositions.get(atomUnit);
        if (transitiveCompositions==null) {
            throw new RuntimeException("Atom unit="+atomUnit+" is unknown");
        }
        List compositions = new ArrayList(transitiveCompositions.size()+1);
        compositions.add(new Composition(unit, 1));
        for (int i=0; i<transitiveCompositions.size(); i++) {
            Composition nextTransitive = (Composition) transitiveCompositions.get(i);
            compositions.add(new Composition(nextTransitive, atomCount));
        }
        myUnit2compositions.put(unit, compositions);
    }

    public Composition getComposition(TimeUnitImpl timeUnit, TimeUnit atomUnit) {
        Composition result = null;
        List compositions = (List) myUnit2compositions.get(timeUnit);
        if (compositions==null) {
            throw new RuntimeException("Unit="+timeUnit+" has no compositions");
        }
        for (int i=0; i<compositions.size(); i++) {
            Composition next = (Composition)compositions.get(i);
            if (next.myAtom.equals(atomUnit)) {
                result = next;
                break;
            }
        }
        return result;
    }


    class Composition {
        final TimeUnit myAtom;
        final int myAtomCount;

        Composition(TimeUnit atomUnit, int atomCount) {
            myAtom = atomUnit;
            myAtomCount = atomCount;
        }

        Composition(Composition transitiveComposition, int atomCount) {
            myAtomCount = atomCount*transitiveComposition.myAtomCount;
            myAtom = transitiveComposition.myAtom;
        }

        int getAtomCount() {
            return myAtomCount;
        }
    }

}
