package bingo.common.user.service.impl;

import bingo.common.user.entity.User;
import bingo.common.user.mapper.UserMapper;
import bingo.common.user.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Majiaju
 * @since 2024-08-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
