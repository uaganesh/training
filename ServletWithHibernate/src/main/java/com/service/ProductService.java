package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {
	
	ProductDao pd =new ProductDao();
	
public String storeProduct(Product product)
{
	if(product.getPrice()<100)
	{
		return "Product Price must be greater than 100";
	}
	else if(pd.storeProduct(product)>0)
		
	{
		return"Product Stored Successfully";
	}
	else
	{
		return "Product didnt store";
	}
}

public String deleteProduct(int pid)
{
	if(pd.deleteProduct(pid)>0)
	{
		return "Product Details deleted Successfully";
	}
	else
	{
		return "Product not present";
	}
}

public String updateProduct(Product product)
{
	Product pp=pd.findProduct(product.getPid());
	
   if(pp==null)
   {
	   return "product not present";
   }
   else if(product.getPrice()<pp.getPrice())
   {
	   return "New price must be grater then old price";
   }
   else if(pd.updateProduct(product)>0)
   {
	   return "Product Data Updated";
   }
   else{
	   return "product didn't update";
   }

}

public String findProduct(int pid)
{
	Product pp=pd.findProduct(pid);
	if(pp==null)
	{
		return"product not presnt";
	}
	else
	{
		return pp.toString();
	}
}

public List<Product> findAllProduct()
{
	List<Product> listOfProduct=pd.findAllProduct();
	Iterator<Product> li =listOfProduct.iterator();
	while(li.hasNext())
	{
		Product p=li.next();
		p.setPrice(p.getPrice() - p.getPrice()*0.10f);
		
	}
	return listOfProduct;
	
}

}


