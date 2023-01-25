package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.admin;

import com.iucosoft.nighthawk_interteh_service.entities.Portofolio;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.PortofolioServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.dto.PortofolioDTO;
import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.PortofolioConvertor;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Dorina
 */
@Controller
@RequestMapping("/admin/portofolio")
public class PortofolioController {

    private final Logger logger = LoggerFactory.getLogger(NWRolesController.class);

    @Autowired
    PortofolioServiceIntf portofolioService;

    @Autowired
    PortofolioConvertor portofolioConvertor;

    /**
     * Show the list of Portofolio
     *
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ModelAndView list() {

        ModelAndView mv = new ModelAndView("admin.portofolio.list.def");
        try {
            List<Portofolio> lista = portofolioService.list();

            List<PortofolioDTO> portofolioDTOList = portofolioConvertor.convert(lista);

            mv.addObject("portofolioDTOList", portofolioDTOList);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return mv;
    }

    /**
     * Show an Portofolio
     */
    @RequestMapping(value = "/showView/{documentId}", method = RequestMethod.GET)
    String showView(@PathVariable("documentId") int documentId, Model model) {
        logger.debug("showView() documentId: {}", documentId);

        Portofolio portofolio = portofolioService.findById(documentId);
        if (portofolio == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Portofolio not found");

        } else {
            PortofolioDTO portofolioDTO = portofolioConvertor.convert(portofolio);

            model.addAttribute("portofolio", portofolioDTO);

        }

        return "admin.portofolio.showView.def";
    }

    /**
     * Save or Update Portofolio *
     *
     * //////////////////////
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String saveOrUpdatePortofolio(@ModelAttribute("portofolioDTO") PortofolioDTO portofolioDTO,
            BindingResult result, Model model, final RedirectAttributes redirectAttributes) {

        logger.debug("saveOrUpdatePortofolio() : {}", portofolioDTO);

        if (result.hasErrors()) {
            return "admin.nwroles.showEdit.def";
        } else {

            redirectAttributes.addFlashAttribute("css", "success");
            if (portofolioDTO.getDocumentId() == null) {
                redirectAttributes.addFlashAttribute("msg", "Portofolio  added successfully!");
            } else {
                redirectAttributes.addFlashAttribute("msg", "Portofolio updated successfully!");
            }

            Portofolio portofolio = portofolioConvertor.convert(portofolioDTO);
            portofolioService.saveOrUpdate(portofolio);

            return "redirect:/admin/portofolio/list";
        }
    }

    @RequestMapping(value = "/showAddNewPortofolio", method = RequestMethod.GET)
    String showAddNewPortofolio(Model model) {

        PortofolioDTO portofolioDTO = new PortofolioDTO();
        model.addAttribute("portofolioDTO", portofolioDTO);

        return "admin.portofolio.showEdit.def";
    }

    /**
     * showEdit Buton cu numele Update in sens de arata pentru a fi editat
     */
    @RequestMapping(value = "/showEdit/{documentId}", method = RequestMethod.GET)
    String showEdit(@PathVariable("documentId") int documentId, Model model) {
        Portofolio portofolio = portofolioService.findById(documentId);
        if (portofolio == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Portofolio not found");

        } else {
            PortofolioDTO portofolioDTO = portofolioConvertor.convert(portofolio);
            model.addAttribute("portofolioDTO", portofolioDTO);

        }

        return "admin.portofolio.showEdit.def";
    }

    /**
     *
     * Delete Portofolio
     *
     */
    @RequestMapping(value = "/delete/{documentId}", method = RequestMethod.GET)
    public String delete(@PathVariable("documentId") int documentId, final RedirectAttributes redirectAttributes) {

        logger.debug("delete() : {}", documentId);

        portofolioService.delete(documentId);

        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "Portofolio is deleted!");

        return "redirect:/admin/portofolio/list";

    }

}
