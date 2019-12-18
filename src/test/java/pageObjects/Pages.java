package pageObjects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pages {

    @Autowired
    public GenericPage generic;
    @Autowired
    public LoginPage login;
    @Autowired
    public PropagandaPage propaganda;
    @Autowired
    public RootPage root;
    @Autowired
    public FolderTreePage folderTree;
    @Autowired
    public FileActionsPage fileActions;
    @Autowired
    public SharePage share;
}
