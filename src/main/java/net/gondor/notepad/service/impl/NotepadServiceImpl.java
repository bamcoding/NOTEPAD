package net.gondor.notepad.service.impl;

import net.gondor.notepad.biz.NotepadBiz;
import net.gondor.notepad.service.NotepadService;
import net.gondor.notepad.vo.NotepadList;
import net.gondor.notepad.vo.NotepadSearchVO;
import net.gondor.notepad.vo.NotepadVO;

public class NotepadServiceImpl implements NotepadService{
	NotepadBiz notepadBiz;

	public void setNotepadBiz(NotepadBiz notepadBiz) {
		this.notepadBiz = notepadBiz;
	}

	@Override
	public NotepadList getAllNotepadList(NotepadSearchVO searchVO) {
		// TODO Auto-generated method stub
		return notepadBiz.getAllNotepadList(searchVO);
	}

	@Override
	public boolean removeNotepadById(String id) {
		// TODO Auto-generated method stub
		return notepadBiz.removeNotepadById(id);
	}

	@Override
	public boolean addNotepad(NotepadVO notepad) {
		// TODO Auto-generated method stub
		return notepadBiz.addNotepad(notepad);
	}

	@Override
	public NotepadVO getNotepadById(String id) {
		// TODO Auto-generated method stub
		return notepadBiz.getNotepadById(id);
	}

	@Override
	public boolean editNotepad(NotepadVO notepad) {
		// TODO Auto-generated method stub
		return notepadBiz.editNotepad(notepad);
	}
	
	
}
