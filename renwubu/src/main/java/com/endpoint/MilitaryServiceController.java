package com.endpoint;


import com.model.BaseResponse;
import com.model.request.BasePageQueryResponse;
import com.model.request.PageQueryMilitaryServiceRegistrationRequest;
import com.persistence.entity.MilitaryServiceRegistration;
import com.service.MilitaryServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 兵役服务
 *
 * @author wuyuxiao
 */
@RestController
@RequestMapping("/api")
public class MilitaryServiceController {

    @Autowired
    private MilitaryServiceService service;

    /**
     * 兵役登记表分页接口
     *
     * @param request
     * @return
     */
    @PostMapping("/page_query_military_service_registration")
    public BaseResponse<BasePageQueryResponse<MilitaryServiceRegistration>> pageQueryMilitaryServiceRegistration(@RequestBody PageQueryMilitaryServiceRegistrationRequest request) {
        try {

            //1.分页查询
            List<MilitaryServiceRegistration> list = service.pageQuery(request);

            //2.查询总记录数
            int count = service.queryTotalCount(request);

            return BaseResponse.ok(new BasePageQueryResponse<>(list, count));
        } catch (Exception e) {
            return BaseResponse.failed(e.getLocalizedMessage());
        }
    }

}
