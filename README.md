# HULK - Continuous Design Flaw Detection

TODO: Here comes the abstract

HULK is a tool prototype to support object-oriented software development by continuously detecting design flaws over the version history. As a result, an annotated model of the program containing design flaw information is created. Moreover, the annotations also appear in the source code, effectively supporting maintenance decisions.

## Evaluation

We evaluate HULK on an established corpus of 16 (TODO: check) open-source Java projects selected from related literature on anti-pattern and code smell detection. Sources for the corpus are:

- [Moha et al.: DECOR - A Method for the Specification and Detection of Code and Design Smells. In: Transactions on Software Engineering, vol. 36, 2010.](http://www.irisa.fr/triskell/publis/2009/Moha09d.pdf)
- [Khomh et al.: BDTEX - A GQM-based Bayesian Approach for the Detection of Antipatterns. In: Journal of Systems and Software, vol. 84, 2011.](http://dl.acm.org/citation.cfm?id=1942375)
- [Ujhelyi et al.: Anti-Pattern Detection with Model Queries: A Comparison of Approaches](http://publicatio.bibl.u-szeged.hu/4761/1/2498771.pdf)

Based on these papers, the following projects has been selected for the evaluation corpus:

- [ArgoUML, version 0.19.8](http://argouml.tigris.org/): an open-source UML modeling tool
- [Azureus, version 2.3.0.6](http://dev.vuze.com/): an open-source BitTorrent client, now called Vuze
- [Gantt, version 1.10.2](https://sourceforge.net/projects/ganttproject/files%2FOldFiles/): an open-source project scheduling and management tool
- JabRef, version 11
- JavaSolitaire, version 1.3
- JEdit, version 4.0
- JSciCalc, version 2.10.0
- JTransformation, version 3.1
- JUnit, version 3.8.2
- log4j, version 1.2.17
- Lucene, version 1.4.3
- Nutch, version 0.9
- PMD, version 1.8
- QuickUML, version 2001
- SvnKit, version 1.8.12
- Xerces, version 2.7.0
