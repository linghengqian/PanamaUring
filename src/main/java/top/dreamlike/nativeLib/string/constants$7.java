// Generated by jextract

package top.dreamlike.nativeLib.string;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$7 {

    static final FunctionDescriptor strcasecmp_l$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strcasecmp_l$MH = RuntimeHelper.downcallHandle(
        "strcasecmp_l",
        constants$7.strcasecmp_l$FUNC
    );
    static final FunctionDescriptor strncasecmp_l$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strncasecmp_l$MH = RuntimeHelper.downcallHandle(
        "strncasecmp_l",
        constants$7.strncasecmp_l$FUNC
    );
    static final FunctionDescriptor explicit_bzero$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle explicit_bzero$MH = RuntimeHelper.downcallHandle(
        "explicit_bzero",
        constants$7.explicit_bzero$FUNC
    );
    static final FunctionDescriptor strsep$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle strsep$MH = RuntimeHelper.downcallHandle(
        "strsep",
        constants$7.strsep$FUNC
    );
    static final FunctionDescriptor strsignal$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle strsignal$MH = RuntimeHelper.downcallHandle(
        "strsignal",
        constants$7.strsignal$FUNC
    );
    static final FunctionDescriptor __stpcpy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __stpcpy$MH = RuntimeHelper.downcallHandle(
        "__stpcpy",
        constants$7.__stpcpy$FUNC
    );
}


