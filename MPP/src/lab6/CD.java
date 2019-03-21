package lab6;

public class CD extends LendingItem{

	   private String productID;
	    private String title;
	    private String company;

	    public CD(String productID, String title, String company) {
	        this.productID = productID;
	        this.title = title;
	        this.company = company;
	    }

		public String getProductID() {
			return productID;
		}

		public void setProductID(String productID) {
			this.productID = productID;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((productID == null) ? 0 : productID.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CD other = (CD) obj;
			if (productID == null) {
				if (other.productID != null)
					return false;
			} else if (!productID.equals(other.productID))
				return false;
			return true;
		}
		
		
		

	    
}
