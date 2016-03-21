package SPX_3X;

public class DailyPricing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Definde Initial Value
		
		double close_spx = 2019.64;
		double close_up3x_price = 59.66;  //UPRO 
		double close_down3x_price = 30.86;  //SPXU
		
		//////////////////////////////////////////////
		
		long int_close_spx = Math.round(close_spx);
	
		
		int daily_range = (int)Math.round(int_close_spx*0.04);
		
		double delta_up_value = (close_up3x_price/int_close_spx)*3.0;
		
		double delta_down_value = (close_down3x_price/int_close_spx)*3.0;
		
		double [] up3xArrayUp = new double[daily_range];
		double [] up3xArrayDown = new double[daily_range];
		
		double [] down3xArrayUp = new double[daily_range];
		double [] down3xArrayDown = new double[daily_range];
		

		
		for(int i= daily_range-1;i>0;i--){
			up3xArrayDown[i] = close_up3x_price-i*delta_up_value;
			up3xArrayDown[i] = Math.round(up3xArrayDown[i]*100)/100.00;
			
			down3xArrayDown[i] = close_down3x_price+i*delta_down_value;
			down3xArrayDown[i] = Math.round(down3xArrayDown[i]*100)/100.00;
			
			
			System.out.println("Price:"+(int_close_spx-i)+"\t"+up3xArrayDown[i]+"\t"+down3xArrayDown[i]);
		}
		
		for(int i=0;i<daily_range;i++){
			up3xArrayUp[i] = close_up3x_price+i*delta_up_value;
			up3xArrayUp[i] = Math.round(up3xArrayUp[i]*100)/100.00;
			
			down3xArrayUp[i] = close_down3x_price-i*delta_down_value;
			down3xArrayUp[i] = Math.round(down3xArrayUp[i]*100)/100.00;
	
			System.out.println("Price:"+(int_close_spx+i)+"\t"+up3xArrayUp[i]+"\t"+down3xArrayUp[i]);
		}
		
        
/*		System.out.println("Close Price: "+int_close_spx);
		System.out.println("Day Rang: "+daily_range);*/
	}

}
