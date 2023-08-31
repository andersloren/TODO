package lexicon.maintenance;

import lexicon.data.dao.AppUserDao;
import lexicon.data.impl.AppUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Collection;

import static lexicon.maintenance.StaticResources.APP_USER_FILE;

@Component
public class ApplicationTerminator {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationTerminator.class);


    private final AppUserDao appUserDao;
    private final ObjectMapper objectMapper;

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @Autowired
    public ApplicationTerminator(AppUserDao appUserDao, ObjectMapper objectMapper) {
        this.appUserDao = appUserDao;
        this.objectMapper = objectMapper;
    }

    private void saveAppUsers(Collection<AppUser> appUsers) {
        try{
            objectMapper.writeValue(APP_USER_FILE, appUsers);
            LOGGER.info("AppUsers were successfully persisted on termination");
        }catch (IOException ex){
            LOGGER.error(ex.getMessage());
        }
    }
}
