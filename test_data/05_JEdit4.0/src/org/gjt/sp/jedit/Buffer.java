package org.gjt.sp.jedit;

import java.io.File;
import java.util.Hashtable;
import java.util.Vector;

import javax.swing.Icon;
import javax.swing.text.Position;
import javax.swing.text.Segment;

import org.gjt.sp.jedit.buffer.BufferChangeListener;
import org.gjt.sp.jedit.buffer.FoldHandler;
import org.gjt.sp.jedit.io.VFS;
import org.gjt.sp.jedit.syntax.KeywordMap;
import org.gjt.sp.jedit.syntax.ParserRuleSet;
import org.gjt.sp.jedit.syntax.Token;
import org.gjt.sp.jedit.textarea.FoldVisibilityManager;
import org.gjt.sp.jedit.textarea.JEditTextArea;
import org.gjt.sp.jedit.textarea.Selection;
import org.gjt.sp.util.IntegerArray;
import org.gjt.sp.util.SegmentBuffer;

public class Buffer implements EBComponent {

	public class TokenList {

		public void addToken(int count, byte default1, ParserRuleSet rules) {
			// TODO Auto-generated method stub
			
		}

		public Token getFirstToken() {
			// TODO Auto-generated method stub
			return null;
		}

	}

	public static final String TRAILING_EOL = null;
	public static String ENCODING;
	public static String SELECTION;
	public static String GZIPPED;
	public static String LINESEP;
	public static String BACKED_UP;
	protected static String CARET;
	public static String SCROLL_VERT;
	public static String SCROLL_HORIZ;
	public Buffer next;
	public Buffer prev;

	public Buffer(String path, boolean newFile, boolean b, Hashtable props) {
		// TODO Auto-generated constructor stub
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public String getPath() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getProperty(Object name) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getStringProperty(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public FoldHandler getMode() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getLineEndOffset(int endLine) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setStringProperty(String string, String text) {
		// TODO Auto-generated method stub
		
	}

	public void propertiesChanged() {
		// TODO Auto-generated method stub
		
	}

	public int getTabSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isLoaded() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getLineStartOffset(int startLine) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getLineCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Icon getIcon() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getBooleanProperty(String trailingEol) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setStringProperty(Object eNCODING2, String encoding3) {
		// TODO Auto-generated method stub
		
	}

	public void setDirty(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void setBooleanProperty(Object gZIPPED2, boolean gzippedValue) {
		// TODO Auto-generated method stub
		
	}

	public void setProperty(String string, Integer integer) {
		// TODO Auto-generated method stub
		
	}

	public void setMode(Mode mode) {
		// TODO Auto-generated method stub
		
	}

	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEditable() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean save(View view, Object object, boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

	public KeywordMap getKeywordMapAtOffset(int caret) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLineText(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void beginCompoundEdit() {
		// TODO Auto-generated method stub
		
	}

	public Vector getMarkers() {
		// TODO Auto-generated method stub
		return null;
	}

	public File getFile() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getLineOfOffset(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void readLock() {
		// TODO Auto-generated method stub
		
	}

	public void addMarker(char shortcut, int position) {
		// TODO Auto-generated method stub
		
	}

	public void removeAllMarkers() {
		// TODO Auto-generated method stub
		
	}

	public void setProperty(String lINESEP2, String lineSeparator) {
		// TODO Auto-generated method stub
		
	}

	public void setProperty(String loadData, SegmentBuffer seg) {
		// TODO Auto-generated method stub
		
	}

	public void setProperty(String endOffsets, IntegerArray endOffsets2) {
		// TODO Auto-generated method stub
		
	}

	public void setNewFile(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void getLineText(int i, Segment lineSegment) {
		// TODO Auto-generated method stub
		
	}

	public void readUnlock() {
		// TODO Auto-generated method stub
		
	}

	public void endCompoundEdit() {
		// TODO Auto-generated method stub
		
	}

	public boolean isNewFile() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getIntegerProperty(String permissionsProperty, int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setIntegerProperty(String permissionsProperty, int permissions) {
		// TODO Auto-generated method stub
		
	}

	public void setReadOnly(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void unsetProperty(String bACKED_UP2) {
		// TODO Auto-generated method stub
		
	}

	public boolean isTemporary() {
		// TODO Auto-generated method stub
		return false;
	}

	public void handleMessage(EBMessage message) {
		// TODO Auto-generated method stub
		
	}

	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void insert(Object length, String string) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isPerformingIO() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean load(View view, boolean b) {
		return true;
	}

	public boolean isUntitled() {
		// TODO Auto-generated method stub
		return false;
	}

	public Marker getMarker(char charAt) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMode() {
		// TODO Auto-generated method stub
		
	}

	public void autosave() {
		// TODO Auto-generated method stub
		
	}

	public String getText(int i, int j, Segment segment) {
		// TODO Auto-generated method stub
		return null;
	}

	public Buffer getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	public Buffer getPrev() {
		// TODO Auto-generated method stub
		return prev;
	}

	public void remove(int start, int i) {
		// TODO Auto-generated method stub
		
	}

	public void insert(int start, String string) {
		// TODO Auto-generated method stub
		
	}

	public void checkModTime(View view) {
		// TODO Auto-generated method stub
		
	}

	public boolean insideCompoundEdit() {
		// TODO Auto-generated method stub
		return false;
	}

	public int getFoldLevel(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getIndentSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean indentLine(int i, boolean b, boolean c) {
		return false;
	}

	public VFS getVFS() {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertFile(View view, String path) {
		// TODO Auto-generated method stub
		
	}

	public void writeUnlock() {
		// TODO Auto-generated method stub
		
	}

	public boolean isFoldStart(int line) {
		// TODO Auto-generated method stub
		return false;
	}

	public Marker getMarkerInRange(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	public void shiftIndentRight(int[] selectedLines) {
		// TODO Auto-generated method stub
		
	}

	public void writeLock() {
		// TODO Auto-generated method stub
		
	}

	public void _releaseFoldVisibilityManager(FoldVisibilityManager foldVisibilityManager) {
		// TODO Auto-generated method stub
		
	}

	public boolean isNextLineRequested() {
		// TODO Auto-generated method stub
		return false;
	}

	public Position createPosition(int pos) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeBufferChangeListener(BufferChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	public void addBufferChangeListener(BufferChangeListener bufferHandler) {
		// TODO Auto-generated method stub
		
	}

	public TokenList markTokens(int currentPhysicalLine) {
		// TODO Auto-generated method stub
		return null;
	}

	public FoldVisibilityManager _getFoldVisibilityManager(JEditTextArea jEditTextArea) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getLineLength(int line) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getText(int start, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeTrailingWhiteSpace(int[] selectedLines) {
		// TODO Auto-generated method stub
		
	}

	public void indentLines(int[] selectedLines) {
		// TODO Auto-generated method stub
		
	}

	public void shiftIndentLeft(int[] selectedLines) {
		// TODO Auto-generated method stub
		
	}

	public String getContextSensitiveProperty(int caret2, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addOrRemoveMarker(char c, int caret2) {
		// TODO Auto-generated method stub
		
	}

	public boolean isTransactionInProgress() {
		// TODO Auto-generated method stub
		return false;
	}

	public int[] getFoldAtLine(int caretLine) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isClosed() {
		// TODO Auto-generated method stub
		return false;
	}

	public void commitTemporary() {
		// TODO Auto-generated method stub
		
	}

}
