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
        return priceService;
    }
    
    public void setPriceService(float priceService){
        this.priceService = priceService;
    }
       
    @Override
    public void displayService() {
        System.out.println("#*************************# ");
        System.out.println("#***Rock n Roll Haircut***# ");
        System.out.println("#*******Service List******# ");
        System.out.println("1. Haircut : IDR 45K  ");
        System.out.println("2. Haircut + Hairwash: IDR 55K  ");
        System.out.println("3. Hairwash Only : IDR 15K ");
        System.out.println("#*************************# ");
        System.out.println("Choose (1/2/3): ");
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
