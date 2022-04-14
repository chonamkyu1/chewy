package egovframework.example.test.service;

import java.util.List;

import egovframework.example.test.vo.ProductVO;

public interface ProductMapper {
	
	 List<ProductVO> selectProductList(ProductVO productVO) throws Exception;
	 void insertProduct(ProductVO productVO) throws Exception;
	 void updateProduct(ProductVO productVO) throws Exception;
	 void deleteProduct(ProductVO productVO) throws Exception;
	 ProductVO selectProduct(ProductVO productVO) throws Exception;
}
