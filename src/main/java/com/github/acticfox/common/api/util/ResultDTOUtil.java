package com.github.acticfox.common.api.util;

import com.github.acticfox.common.api.result.ResultDTO;

/**
 * Created by fanyong.kfy 2017/8/3.
 */
public class ResultDTOUtil {

	public static boolean isNotNull(ResultDTO resultDTO) {
		return isSuccess(resultDTO) && resultDTO.getData() != null;
	}

	public static boolean isNull(ResultDTO resultDTO) {
		return !isNotNull(resultDTO);
	}

	public static boolean isSuccess(ResultDTO resultDTO) {
		return resultDTO != null && resultDTO.isSuccess();
	}

	public static boolean isFailed(ResultDTO resultDTO) {
		return !isSuccess(resultDTO);
	}


}
