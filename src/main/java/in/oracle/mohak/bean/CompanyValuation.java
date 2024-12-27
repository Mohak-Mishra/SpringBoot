package in.oracle.mohak.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("companyValuation")
public class CompanyValuation {
    private int stockPrice;
    private int stockQuantity;
    private int valuationPrice;

    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    @Override
    public String toString() {
        return valuationPrice + " " + stockQuantity + " " + stockPrice;
    }

    public void setValuationPrice(int valuationPrice) {
        this.valuationPrice = stockPrice*stockQuantity;
    }
}
