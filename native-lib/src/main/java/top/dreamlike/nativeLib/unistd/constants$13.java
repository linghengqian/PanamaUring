// Generated by jextract

package top.dreamlike.nativeLib.unistd;

import top.dreamlike.common.CType;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.OfAddress;
import static java.lang.foreign.ValueLayout.OfInt;
class constants$13 {

    static final  OfAddress optarg$LAYOUT = CType.C_POINTER$LAYOUT;
    static final VarHandle optarg$VH = constants$13.optarg$LAYOUT.varHandle();
    static final MemorySegment optarg$SEGMENT = RuntimeHelper.lookupGlobalVariable("optarg", constants$13.optarg$LAYOUT);
    static final  OfInt optind$LAYOUT = CType.C_INT$LAYOUT;
    static final VarHandle optind$VH = constants$13.optind$LAYOUT.varHandle();
    static final MemorySegment optind$SEGMENT = RuntimeHelper.lookupGlobalVariable("optind", constants$13.optind$LAYOUT);
    static final  OfInt opterr$LAYOUT = CType.C_INT$LAYOUT;
    static final VarHandle opterr$VH = constants$13.opterr$LAYOUT.varHandle();
    static final MemorySegment opterr$SEGMENT = RuntimeHelper.lookupGlobalVariable("opterr", constants$13.opterr$LAYOUT);
    static final  OfInt optopt$LAYOUT = CType.C_INT$LAYOUT;
    static final VarHandle optopt$VH = constants$13.optopt$LAYOUT.varHandle();
    static final MemorySegment optopt$SEGMENT = RuntimeHelper.lookupGlobalVariable("optopt", constants$13.optopt$LAYOUT);
    static final FunctionDescriptor getopt$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle getopt$MH = RuntimeHelper.downcallHandle(
        "getopt",
        constants$13.getopt$FUNC
    );
    static final FunctionDescriptor gethostname$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gethostname$MH = RuntimeHelper.downcallHandle(
        "gethostname",
        constants$13.gethostname$FUNC
    );
}


