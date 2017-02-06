package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.ui.ModelMap;

public class HelloController extends AbstractController{

@Override
protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
	ModelAndView modelandview = new ModelAndView("HelloPage");
	modelandview.addObject("welcomeMessage", "Hi user, weolcome");
	return modelandview;
}

}