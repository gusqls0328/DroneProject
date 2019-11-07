/*
java -Djava.library.path=/usr/lib/jni:/home/pi/opencv/opencv-3.4.5/build/lib -cp classes:lib/'*' companion.companion.RealMain
 */

package kosa.team2.drone.main;

import kosa.team2.drone.network.NetworkConfig;
import syk.drone.device.Camera;
import syk.drone.device.FlightController;
//import syk.sample.drone.network.NetworkConfig;

public class RealMain {
    public static void main(String[] args) {
        NetworkConfig networkConfig = new NetworkConfig();

        FlightController flightController = new FlightController();
        flightController.mavlinkConnectRxTx("/dev/ttyAMA0");
        flightController.mqttConnect(
                networkConfig.mqttBrokerConnStr,
                networkConfig.droneTopic +"/fc/pub",
                networkConfig.droneTopic +"/fc/sub"
        );

        Camera camera0 = new Camera();
        camera0.cameraConnect(0, 320, 240, 180); // 먼저 꽃는 순서에 따라 번호가 매겨짐
        // width와 height는 해상도 angle은 뒤집혔을 때 180 혹은 0으로 바꿔주면 됨
        camera0.mattConnect(
                networkConfig.mqttBrokerConnStr,
                networkConfig.droneTopic + "/cam0/pub",
                networkConfig.droneTopic + "/cam0/sub"
        );

        Camera camera1 = new Camera();
        camera1.cameraConnect(1, 320, 240, 0);
        camera1.mattConnect(
                networkConfig.mqttBrokerConnStr,
                networkConfig.droneTopic +"/cam1/pub",
                networkConfig.droneTopic +"/cam1/sub" // 만약에 뒤집히고 그러면 그냥 토픽 번호만 바꿔주면됨
        );
    }
}
