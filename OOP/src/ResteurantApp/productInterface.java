package ResteurantApp;

public interface productInterface {

	public default void addNewProduct(Product[] products, Product newProduct) {
		//adds new product to product list. This function can be used for using a product to general products array or menu array.
		//menu is not the product list because all products doesn't have to be shown to customers immediately
		//this method adds a product to a product array and this array can be general products or menu
		// even the product is in the menu, it can be still closed by the lack of stock.
	}
	public default void deleteProduct(Product[] products, Product deletedProduct) {
		//deletes the choosen product from a product array.
		//menu is not the product list because all products doesn't have to be shown to customers immediately
		//this method deletes a product from a product array and this array can be general products or menu
			
	}
	public default void stockUpdater(Product product, int updateStock) {
		//this method updates the stock of a product
		//this method MUST be called after all order operations to update stocks simultaneously so if a product is not enough it can be closed to sell
		
	}
	public default void updateProduct(Product product,Product newProduct) {
		//this updates a products information as requested.
		//searches for the product and replaces it with newProduct
	}
	
	
	
}
