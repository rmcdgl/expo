#if __cplusplus

#import "NativeDevMenuReanimatedModule.h"
#import <React/RCTEventDispatcher.h>
#include <memory>

namespace devmenureanimated {

std::shared_ptr<devmenureanimated::NativeDevMenuReanimatedModule> createDevMenuReanimatedModule(
    RCTBridge *bridge,
    std::shared_ptr<facebook::react::CallInvoker> jsInvoker);

}

#endif
