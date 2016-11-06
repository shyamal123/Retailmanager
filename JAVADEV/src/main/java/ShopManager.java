import java.util.Map;

interface ShopManager{
	public Map<String,Address> constructAddressMap(String jsonString) throws Exception;
	public String findNearestAddresses(Map<String,Address> addressMap,double currentLat,double currentLon);
}
