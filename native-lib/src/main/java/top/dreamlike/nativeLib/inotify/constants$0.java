// Generated by jextract

package top.dreamlike.nativeLib.inotify;

import top.dreamlike.common.CType;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$0 {

    static final FunctionDescriptor inotify_init$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT);
    static final MethodHandle inotify_init$MH = RuntimeHelper.downcallHandle(
            "inotify_init",
            constants$0.inotify_init$FUNC
    );
    static final FunctionDescriptor inotify_init1$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
            CType.C_INT$LAYOUT
    );
    static final MethodHandle inotify_init1$MH = RuntimeHelper.downcallHandle(
            "inotify_init1",
            constants$0.inotify_init1$FUNC
    );
    static final FunctionDescriptor inotify_add_watch$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
            CType.C_INT$LAYOUT,
            CType.C_POINTER$LAYOUT,
            CType.C_INT$LAYOUT
    );
    static final MethodHandle inotify_add_watch$MH = RuntimeHelper.downcallHandle(
            "inotify_add_watch",
            constants$0.inotify_add_watch$FUNC
    );
    static final FunctionDescriptor inotify_rm_watch$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
            CType.C_INT$LAYOUT,
            CType.C_INT$LAYOUT
    );
    static final MethodHandle inotify_rm_watch$MH = RuntimeHelper.downcallHandle(
            "inotify_rm_watch",
            constants$0.inotify_rm_watch$FUNC
    );
}


