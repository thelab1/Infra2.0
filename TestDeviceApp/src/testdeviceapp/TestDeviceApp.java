package testdeviceapp;

import devicebase.DeviceBase;
import devicemodel.DeviceNode;
import devicemodel.NodeManager;
import java.util.Map;

/**
 *
 * @author pobzeb
 */
public class TestDeviceApp extends DeviceBase {

    public TestDeviceApp(String[] args) {
        super(args);
    }

    @Override
    public void startApplication(Map<String, String> args, DeviceNode systemConfig) {
        System.out.println("Arguments:");
        for (String key : args.keySet()) {
            System.out.println("\t"+key+": "+args.get(key));
        }

        System.out.println("Here's the Tree:\n"+NodeManager.getRootNode().getString());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TestDeviceApp(args);
    }
}
