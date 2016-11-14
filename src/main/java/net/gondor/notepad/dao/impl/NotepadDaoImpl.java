package net.gondor.notepad.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import net.gondor.notepad.dao.NotepadDao;
import net.gondor.notepad.vo.NotepadSearchVO;
import net.gondor.notepad.vo.NotepadVO;

public class NotepadDaoImpl extends SqlSessionDaoSupport implements NotepadDao{

	@Override
	public int getNotepadCount(NotepadSearchVO searchVO) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("notepadDao.getNotepadCount", searchVO);
	}

	@Override
	public List<NotepadVO> getAllNotepadList(NotepadSearchVO searchVO) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("notepadDao.getAllNotepadList", searchVO);
	}

	@Override
	public int removeNotepadById(String id) {
		// TODO Auto-generated method stub
		return getSqlSession().delete("notepadDao.removeNotepadById",id);
	}

	@Override
	public int addNotepad(NotepadVO notepad) {
		// TODO Auto-generated method stub
		return getSqlSession().insert("notepadDao.addNotepad", notepad);
	}

	@Override
	public NotepadVO getNotepadById(String id) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("notepadDao.getNotepadById", id);
	}

	@Override
	public int editNotepad(NotepadVO notepad) {
		// TODO Auto-generated method stub
		return getSqlSession().update("notepadDao.editNotepad", notepad);
	}

}
