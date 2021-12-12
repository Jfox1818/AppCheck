package com.TestApp.Service;

import com.Aviolinx.stub.GetRostersResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

public class SoapClient extends WebServiceGatewaySupport {

    public GetRostersResponse getArrayOfCrew(String url, Object request){
        JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url, request);
        return (GetRostersResponse) res.getValue();
    }

}
