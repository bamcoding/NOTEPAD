package net.gondor.notepad.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.gondor.notepad.common.util.pager.ClassicPageExplorer;
import net.gondor.notepad.common.util.pager.PageExplorer;
import net.gondor.notepad.service.NotepadService;
import net.gondor.notepad.vo.NotepadList;
import net.gondor.notepad.vo.NotepadSearchVO;
import net.gondor.notepad.vo.NotepadVO;

@Controller
public class NotepadController {

	NotepadService notepadService;
	
	public void setNotepadService(NotepadService notepadService) {
		this.notepadService = notepadService;
	}

	@RequestMapping("/")
	public ModelAndView mainPage(NotepadSearchVO searchVO){
		NotepadList notepadList = notepadService.getAllNotepadList(searchVO);

		PageExplorer pageExplorer = new ClassicPageExplorer(notepadList.getPager());
		String page = pageExplorer.getPagingList("pageNumber", "[@]", "", "", "searchForm");
		
		ModelAndView view = new ModelAndView();
		view.addObject("notepadList", notepadList);
		view.addObject("page", page);
		view.addObject("searchVO", searchVO);
		view.setViewName("list");
		return view;
	}
	
	@RequestMapping("/write")
	public String viewWritePage(){
		return "write";
	}
	
	@RequestMapping("/doWrite")
	public ModelAndView addNotepadAction(NotepadVO notepad){
		String cont = notepad.getContent();
		cont = cont.replaceAll("</br>", "\n");
		notepad.setContent(cont);
		
		boolean isSuccess = notepadService.addNotepad(notepad);
		ModelAndView view = new ModelAndView();
		view.setViewName("redirect:/");
		return view;
	}
	
	@RequestMapping("delete/{id}")
	public String doDeleteAction(@PathVariable String id){
		boolean isSuccess = notepadService.removeNotepadById(id);
		return "redirect:/";
	}
	
	@RequestMapping("/detail/{id}")
	public ModelAndView viewDetailPage(@PathVariable String id){
		NotepadVO notepad = notepadService.getNotepadById(id);
		String content = notepad.getContent();
		content = content.replaceAll("\n", "<br/>");
		notepad.setContent(content);
		ModelAndView view = new ModelAndView();
		view.addObject("notepad", notepad);
		view.setViewName("detail");
		return view;
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView viewEditPage(@PathVariable String id){
		NotepadVO notepad = notepadService.getNotepadById(id);
		String content = notepad.getContent();
		content = content.replaceAll("<br/>", "\n");
		notepad.setContent(content);
		ModelAndView view = new ModelAndView();
		view.addObject("notepad", notepad);
		view.setViewName("edite");
		return view;
	}
	
	@RequestMapping("/doEdit")
	public String doEditAction(NotepadVO notepad){
		boolean isSuccess = notepadService.editNotepad(notepad);
		return "redirect:/detail/"+notepad.getId();
	}
}
