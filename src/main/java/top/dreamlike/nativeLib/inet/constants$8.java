// Generated by jextract

package top.dreamlike.nativeLib.inet;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$8 {

    static final FunctionDescriptor inet_net_ntop$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle inet_net_ntop$MH = RuntimeHelper.downcallHandle(
        "inet_net_ntop",
        constants$8.inet_net_ntop$FUNC
    );
    static final FunctionDescriptor inet_net_pton$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle inet_net_pton$MH = RuntimeHelper.downcallHandle(
        "inet_net_pton",
        constants$8.inet_net_pton$FUNC
    );
    static final FunctionDescriptor inet_nsap_addr$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle inet_nsap_addr$MH = RuntimeHelper.downcallHandle(
        "inet_nsap_addr",
        constants$8.inet_nsap_addr$FUNC
    );
    static final FunctionDescriptor inet_nsap_ntoa$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle inet_nsap_ntoa$MH = RuntimeHelper.downcallHandle(
        "inet_nsap_ntoa",
        constants$8.inet_nsap_ntoa$FUNC
    );
    static final MemorySegment __FD_ZERO_STOS$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("stosq");
}


