package net.gondor.notepad.vo;

import java.util.List;

import net.gondor.notepad.common.util.pager.Pager;

public class NotepadList {
	List<NotepadVO> notepadList;
	Pager pager;
	
	public List<NotepadVO> getNotepadList() {
		return notepadList;
	}
	public void setNotepadList(List<NotepadVO> notepadList) {
		this.notepadList = notepadList;
	}
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	
	
}
