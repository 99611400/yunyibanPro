package tech.haonan.server.service.impl.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.haonan.server.entity.Role;
import tech.haonan.server.mapper.RoleMapper;
import tech.haonan.server.service.impl.IRoleService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haonan
 * @since 2021-02-20
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
