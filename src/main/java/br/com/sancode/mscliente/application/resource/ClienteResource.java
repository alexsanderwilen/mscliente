package br.com.sancode.mscliente.application.resource;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.InstanceInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClienteResource {


    private final ApplicationInfoManager applicationInfoManager;


    @GetMapping
    public String status(){
        return "ok";
    }

    @GetMapping("/address")
    public String getAddress(){
        InstanceInfo appInfo = applicationInfoManager.getInfo();
        return appInfo.getHostName();
    }
}