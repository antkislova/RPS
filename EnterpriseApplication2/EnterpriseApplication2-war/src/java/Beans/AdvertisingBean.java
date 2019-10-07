package Beans;

import DAO.AdvertisingDAO;
import Entities.Advertising;
import java.io.Serializable;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Yakov
 */
@ManagedBean(value = "AdvertisingBean")
@SessionScoped
public class AdvertisingBean implements Serializable {
    @EJB
    AdvertisingDAO advDao;
    
    public List<Advertising> getAllAdvertisings() {
        return advDao.getAllAdvertisings();
    }
    
}
