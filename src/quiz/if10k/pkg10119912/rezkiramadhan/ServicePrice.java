/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if10k.pkg10119912.rezkiramadhan;

/**
 *
 * @author hp
 */
public class ServicePrice implements ServiceItem {
    private float priceService;
    private float discount;
    
    public float getPriceService(){
        
    }
    
    public void setPriceService(float priceService){
        this.priceService = priceService;
    }
       
    @Override
    public void displayService() {
       
    }

    @Override
    public float getPrice(int serviceItem) {
        return serviceItem;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
       
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        return parServicePrice;
    }
    
    public float getTotalPay(float PriceService, float discount ){
    
    }
    
}
