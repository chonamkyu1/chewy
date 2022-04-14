package egovframework.example.test.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.test.service.ProductService;
import egovframework.example.test.vo.ProductVO;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/test.do")
	public String testPage() {
		return "test";
	}
	
	
	@RequestMapping(value="/productList.do")
	public String productList(ProductVO productVO, Model model) throws Exception {
		model.addAttribute("list", productService.selectProductList(productVO));
		return "productList";
	}
		
}
