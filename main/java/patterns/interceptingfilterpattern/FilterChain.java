package patterns.interceptingfilterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hoang Phuong on 11/21/2016.
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void execute(String request) {
        for(Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }
}
