package net.gondor.notepad.dao;

import java.util.List;

import net.gondor.notepad.vo.NotepadSearchVO;
import net.gondor.notepad.vo.NotepadVO;

public interface NotepadDao {

	public int getNotepadCount(NotepadSearchVO searchVO);

	public List<NotepadVO> getAllNotepadList(NotepadSearchVO searchVO);

	public int removeNotepadById(String id);

	public int addNotepad(NotepadVO notepad);

	public NotepadVO getNotepadById(String id);

	public int editNotepad(NotepadVO notepad);

}
