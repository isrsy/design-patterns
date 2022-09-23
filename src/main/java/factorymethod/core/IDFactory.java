package factorymethod.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: rensiyu
 * @createTime: 2022/09/22
 */
public class IDFactory extends Factory {
    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void register(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
