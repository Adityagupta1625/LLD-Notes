package CarRentalSystem;

import java.util.List;

public class VehicleRentalSystem {
    List<Store> storeList;
    List<User> userList;

    public VehicleRentalSystem(List<Store> storeList, List<User> userList) {
        this.storeList = storeList;
        this.userList = userList;
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public void addStore(Store store) {
        this.storeList.add(store);
    }

    public void addUser(User user) {
        this.userList.add(user);
    }

    public User getUser(int userId) {
        for (User user : userList) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

    public Store getStore(int storeId) {
        for (Store store : storeList) {
            if (store.getStoreId() == storeId) {
                return store;
            }
        }
        return null;
    }
}
