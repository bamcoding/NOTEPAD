package net.gondor.notepad.service;

import net.gondor.notepad.vo.NotepadList;
import net.gondor.notepad.vo.NotepadSearchVO;
import net.gondor.notepad.vo.NotepadVO;

public interface NotepadService {

	public NotepadList getAllNotepadList(NotepadSearchVO searchVO);

	public boolean removeNotepadById(String id);

	public boolean addNotepad(NotepadVO notepad);

	public NotepadVO getNotepadById(String id);

	public boolean editNotepad(NotepadVO notepad);

}
