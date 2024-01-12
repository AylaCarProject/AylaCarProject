package aylacar;

public class Product {
    private int productId;
    private String name;
    private double cost;
    private String description;
    private int quantity;
    private String comment;
    private String rating;
    private String category;
    boolean productDone;
    int productStatus;
    String picture;

    
    public double getCost() {
		return cost;
	}


	public int getProductStatus() {
		return productStatus;
	}



	public String getPicture() {
		return picture;
	}






	public Product(int productId,String productName,String category,String picture,double cost,boolean productDone, int productStatus,String description,int quantity,String rating,String comment) {   
    	this.productId = productId;
        this.name = productName;
        this.cost = cost;
        this.description = description;
        this.quantity = quantity;
        this.rating=rating;
        this.comment=comment;
        this.category=category;
        this.productDone=productDone;
        this.productStatus=productStatus;
        this.picture=picture;
    }

 



	public void setComments(String comments) {
		this.comment = comments;
	}



	public void setRatings(String rating) {
		this.rating = rating;
	}

	public String getCategory() {
		return category;
	}


	public int getProductId() {
        return productId;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return cost;
    }







	
}
