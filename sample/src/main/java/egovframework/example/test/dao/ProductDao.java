package egovframework.example.test.dao;

import java.util.List;

import egovframework.example.test.vo.ProductVO;

public interface ProductDao {
	 List<ProductVO> selectProductList(ProductVO productVO) throws Exception;
	 void insertProduct(ProductVO productVO) throws Exception;
	 void updateProduct(ProductVO productVO) throws Exception;
	 void deleteProduct(ProductVO productVO) throws Exception;
	 ProductVO selectProduct(ProductVO productVO) throws Exception;
}
