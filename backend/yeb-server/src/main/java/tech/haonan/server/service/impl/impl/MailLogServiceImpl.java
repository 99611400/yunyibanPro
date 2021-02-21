package tech.haonan.server.service.impl.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.haonan.server.entity.MailLog;
import tech.haonan.server.mapper.MailLogMapper;
import tech.haonan.server.service.impl.IMailLogService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haonan
 * @since 2021-02-20
 */
@Service
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
