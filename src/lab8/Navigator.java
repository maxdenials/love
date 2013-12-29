/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.HashMap;

/**
 *
 * @author eskimo
 */
public class Navigator {

    private HashMap<String, ICommand> hm;

    public Navigator() {
        hm = new HashMap<>();
        hm.put("1", new One());
        hm.put("2", new Two());
        hm.put("3", new Three());
        hm.put("4", new Four());
        hm.put("5", new Five());
        hm.put("close", new ExitCommand());
    }

    public ICommand getCommand(String s) {
        ICommand c = hm.get(s);
        if (c != null) {
            return c;
        }
        return new NoCommand();
    }
}
