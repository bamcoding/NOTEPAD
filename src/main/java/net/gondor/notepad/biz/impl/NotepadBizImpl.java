package net.gondor.notepad.biz.impl;

import net.gondor.notepad.biz.NotepadBiz;
import net.gondor.notepad.common.util.pager.Pager;
import net.gondor.notepad.common.util.pager.PagerFactory;
import net.gondor.notepad.dao.NotepadDao;
import net.gondor.notepad.vo.NotepadList;
import net.gondor.notepad.vo.NotepadSearchVO;
import net.gondor.notepad.vo.NotepadVO;

public class NotepadBizImpl implements NotepadBiz{
	NotepadDao notepadDao;

	public void setNotepadDao(NotepadDao notepadDao) {
		this.notepadDao = notepadDao;
	}

	@Override
	public NotepadList getAllNotepadList(NotepadSearchVO searchVO) {
		NotepadList notepadList = new NotepadList();
		int count = notepadDao.getNotepadCount(searchVO);
		
		Pager pager = PagerFactory.getPager(true);
		pager.setTotalArticleCount(count);
		pager.setPageNumber(searchVO.getPageNumber());
		searchVO.setStartNumber(pager.getStartArticleNumber());
		searchVO.setEndNumber(pager.getEndArticleNumber());
		
		notepadList.setNotepadList(notepadDao.getAllNotepadList(searchVO));
		notepadList.setPager(pager);
		return notepadList;
	}

	@Override
	public boolean removeNotepadById(String id) {
		// TODO Auto-generated method stub
		return notepadDao.removeNotepadById(id)>0;
	}

	@Override
	public boolean addNotepad(NotepadVO notepad) {
		// TODO Auto-generated method stub
		return notepadDao.addNotepad(notepad)>0;
	}

	@Override
	public NotepadVO getNotepadById(String id) {
		// TODO Auto-generated method stub
		return notepadDao.getNotepadById(id);
	}

	@Override
	public boolean editNotepad(NotepadVO notepad) {
		// TODO Auto-generated method stub
		return notepadDao.editNotepad(notepad)>0;
	}
	
	
}
