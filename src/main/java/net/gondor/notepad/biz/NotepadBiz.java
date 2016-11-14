package net.gondor.notepad.biz;

import net.gondor.notepad.vo.NotepadList;
import net.gondor.notepad.vo.NotepadSearchVO;
import net.gondor.notepad.vo.NotepadVO;

public interface NotepadBiz {

	public NotepadList getAllNotepadList(NotepadSearchVO searchVO);

	public boolean removeNotepadById(String id);

	public boolean addNotepad(NotepadVO notepad);

	public NotepadVO getNotepadById(String id);

	public boolean editNotepad(NotepadVO notepad);

}
