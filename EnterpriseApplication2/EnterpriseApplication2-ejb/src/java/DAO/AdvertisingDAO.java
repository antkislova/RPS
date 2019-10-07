package DAO;

import Entities.Advertising;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Yakov
 */
@Local
public interface AdvertisingDAO {
    void addAdvertising(Advertising adv);
    void deleteAdvertising(Long id);
    Advertising getById(Long id);
    List<Advertising> getAllAdvertisings();
}
