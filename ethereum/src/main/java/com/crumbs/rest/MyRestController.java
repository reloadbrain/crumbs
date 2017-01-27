package com.crumbs.rest;


import com.crumbs.ethereum.EthereumBean;
import org.ethereum.crypto.ECKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class MyRestController {

    @Autowired
    EthereumBean ethereumBean;

    @RequestMapping(value = "/bestBlock", method = GET, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getBestBlock() throws IOException {
        return ethereumBean.getBestBlock();
    }

    @RequestMapping(value = "/adminInfo", method = GET, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getAdminInfo() throws IOException {
        return ethereumBean.getAdminInfo();
    }

    @RequestMapping(value = "/getBalance", method = POST, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getAccoutBal(@RequestBody String a) throws IOException {
        return ethereumBean.getAccountBal(a).toString();
    }

    @RequestMapping(value = "/sendMockTx", method = POST, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public void sendMockTx(@RequestParam ("sender") String sender, @RequestParam("receiver") String receiver) throws IOException {
        ethereumBean.sendMockTx(sender, receiver);
    }

}
