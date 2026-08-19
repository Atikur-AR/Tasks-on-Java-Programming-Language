package Class_Task.Practice_Problem_04;

class ProductFilter{
        void filterProducts(String category){
            System.out.println("Filter products by Category : "+category);
        }
        void filterProducts(double min, double max){
            System.out.println("Filter products by Price Range : $"+min+" - $"+max);
        }
        
        public void filterProducts(String category, double minPrice, double maxPrice) {
            System.out.println("Filtering products by Category: " + category +
                    " | Price Range: $" + minPrice + " - $" + maxPrice);
        }
        
        void filterProducts(String brand, boolean isBrand) {
            if (isBrand) {
                System.out.println("Filtering products by Brand: " + brand);
            }
        }
        void filterProducts(String category, double minPrice, double maxPrice, String brand) {
            System.out.println("Filtering products by Category: " + category +
                    " | Price Range: $" + minPrice + " - $" + maxPrice +
                    " | Brand: " + brand);
        }
}

public class ProductFilteringSystem {
    public static void main(String[] args) {
        ProductFilter f1 = new ProductFilter();

        f1.filterProducts("Electronics");
        f1.filterProducts(100.0, 500.0);
        f1.filterProducts("Apple", true);
        f1.filterProducts("Fashion", 50.0, 200.0);
        f1.filterProducts("Electronics", 500.0, 1500.0, "Apple");
    }
}
