# Loger of class to README
<div>
    <img src="https://camo.githubusercontent.com/249225c3f9c0858e9e392aafd4a20525b19184294f7b35bc8b0f99796d82ca61/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f434c696f6e2d626c61636b3f7374796c653d666f722d7468652d6261646765266c6f676f3d636c696f6e266c6f676f436f6c6f723d7768697465" alt="LinkedIn Badge"/>
    <img src="https://camo.githubusercontent.com/57cec1c01287dfdc2a3fe64954936293c761b7fa9a7fc1b9de3916a295f15170/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f6a6176612d2532334544384230302e7376673f7374796c653d666f722d7468652d6261646765266c6f676f3d6f70656e6a646b266c6f676f436f6c6f723d7768697465" alt="Twitter Badge"/>
    <img src="https://camo.githubusercontent.com/a2fdb686bf3f4bd26f142a4b60bde87647ff18e340d8251e0aea3fa551bb568e/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f496e74656c6c694a494445412d3030303030302e7376673f7374796c653d666f722d7468652d6261646765266c6f676f3d696e74656c6c696a2d69646561266c6f676f436f6c6f723d7768697465" alt="IntelliJ IDEA"/>
    <img src="https://camo.githubusercontent.com/a0484e6383e852e622da1e934b7724921ab9b69d69246d90f899424b01f6deb1/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f56697375616c25323053747564696f253230436f64652d3030373864372e7376673f7374796c653d666f722d7468652d6261646765266c6f676f3d76697375616c2d73747564696f2d636f6465266c6f676f436f6c6f723d7768697465" alt="VS Code"/>
</div>

# The main objectives of this project
---
<font size=4>This project is made in order to facilitate the documentation of classes in readme.This plugin allows you to document a class in a readme by pressing a keyboard shortcut</font>

# Project code
<font size=4>Using the main Api for the ide, I read the selected text and then write this selected text to the readme file of the corresponding file</font>
```
public class LogDicsript extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        Editor editor = event.getData(PlatformDataKeys.EDITOR);
        String message=String.valueOf(editor.getSelectionModel().getSelectedText());
        String path= event.getProject().getBasePath();
        path+="/docs/README.md";path=path.replace("/","\\");File file=new File(path);
        if(message=="null")Messages.showMessageDialog("Pleas select class shat you want to add to readme", "Log Class", Messages.getInformationIcon());
        else {
            try {
                FileWriter pw = new FileWriter(file, true);
                pw.write("\n# New class\n" + "## " + message);
                pw.flush();
                Messages.showMessageDialog(message, "Log Class", Messages.getInformationIcon());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    @Override
    public boolean isDumbAware() {
        return false;
    }
}
```
Avtor Lukin Daniil №409031
