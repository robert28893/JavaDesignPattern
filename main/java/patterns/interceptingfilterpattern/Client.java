package patterns.interceptingfilterpattern;

/**
 * Created by Hoang Phuong on 11/21/2016.
 */
public class Client {
    private FilterManager filterManager;
    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
