package cms.client.controllers.ModifyUserControllers;

import cms.client.controllers.entityhelpers.User;

public interface ModifyUserInterface {
    public void save();
    public void init(User user);
    public void delete();

}
