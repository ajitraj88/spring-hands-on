package standaloneCollections3;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String, Integer> feeStructure;
    private Properties props;

    public List<String> getFriends() {
        return friends;
    }

    public Properties getProps() {
        return props;
    }

    public Person setProps(Properties props) {
        this.props = props;
        return this;
    }

    public Person setFriends(List<String> friends) {
        this.friends = friends;
        return this;
    }

    public Map<String, Integer> getFeeStructure() {
        return feeStructure;
    }

    public Person setFeeStructure(Map<String, Integer> feeStructure) {
        this.feeStructure = feeStructure;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", feeStructure=" + feeStructure +
                ", props=" + props +
                '}';
    }
}
