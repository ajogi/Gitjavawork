package box;
import java.util.*;
import java.io.*;

public class ProductBO{
	    public void displayAllProductDetails(product pr[], int count){
	        System.out.format("%-10s %-20s %-20s %-10s\n", "Id","ProductName","SupplierName","Price");
	        for(int i=0;i<count;i++){
	            System.out.format("%-10s %-20s %-20s %-10s\n", pr[i].id,pr[i].productName,pr[i].supplierName,pr[i].price);
	        }
	    }
	}