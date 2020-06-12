# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

project(vrsamplebase C CXX)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

add_library(vrsamplebase
        SHARED
        main.cpp)

target_sources(
        vrsamplebase
        PUBLIC
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Appl.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/System.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/PackageFiles.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/OVR_UTF8Util.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/OVR_Uri.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/OVR_FileSys.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/OVR_Stream.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/OVR_MappedFile.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/OVR_BinaryFile2.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/OVR_Lexer2.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/MessageQueue.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/TalkToJava.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Platform/Android/Android.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Misc/Log.c
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/Egl.c
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/Framebuffer.c
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/GlSetup.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/GlBuffer.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/GlTexture.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/GlProgram.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/GlGeometry.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/SurfaceRender.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/SurfaceTexture.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/BitmapFont.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/DebugLines.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/TextureManager.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/EaseFunctions.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/TextureAtlas.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/ParticleSystem.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/PointList.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/Ribbon.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/BeamRenderer.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Render/PanelRenderer.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Model/ModelCollision.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Model/ModelTrace.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Model/ModelRender.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Model/ModelFile.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Model/ModelFile_OvrScene.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Model/ModelFile_glTF.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Model/SceneView.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Locale/tinyxml2.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Locale/OVR_Locale.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/CollisionPrimitive.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/GazeCursor.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/VRMenu.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/SoundLimiter.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/VRMenuObject.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/VRMenuMgr.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/VRMenuComponent.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/VRMenuEvent.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/VRMenuEventHandler.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/Reflection.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/AnimComponents.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/Fader.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/DefaultComponent.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/ReflectionData.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/ActionComponents.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/MetaDataManager.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/ProgressBarComponent.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/ScrollBarComponent.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/SwipeHintComponent.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/TextFade_Component.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/SliderComponent.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/FolderBrowser.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/GuiSys.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/ScrollManager.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/UI/UITexture.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/UI/UIMenu.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/UI/UIObject.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/UI/UIContainer.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/UI/UILabel.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/UI/UIImage.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/UI/UIButton.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/UI/UIProgressBar.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/UI/UINotification.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/UI/UISlider.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/UI/UIDiscreteSlider.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/UI/UIKeyboard.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/GUI/UI/UITextBox.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Input/ArmModel.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Input/HandModel.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Input/Skeleton.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Sound/SoundAssetMapping.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Sound/SoundEffectContext.cpp
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src/Sound/SoundPool.cpp)

include_directories(
        $ENV{OVR_HOME}/VrApi/Include
        $ENV{OVR_HOME}/VrSamples/SampleFramework/Src
        $ENV{OVR_HOME}/1stParty/OVR/Include
        $ENV{OVR_HOME}/1stParty/utilities/include
        $ENV{OVR_HOME}/3rdParty/minizip/src
        $ENV{OVR_HOME}/3rdParty/stb/src
        ${ANDROID_NDK}/sources/android/native_app_glue)

# Third party libraries
find_library(LIB_LOG log)

find_library(LIB_GLES GLESv3)

find_library(LIB_EGL EGL)

add_library(vrapi SHARED IMPORTED)
set_target_properties(vrapi
        PROPERTIES IMPORTED_LOCATION
        $ENV{OVR_HOME}/VrApi/Libs/Android/${ANDROID_ABI}/Debug/libvrapi.so)

add_library(minizip SHARED IMPORTED)
set_target_properties(minizip
        PROPERTIES IMPORTED_LOCATION
        $ENV{OVR_HOME}/3rdParty/minizip/lib/android/${ANDROID_ABI}/libminizip.a)

add_library(stb SHARED IMPORTED)
set_target_properties(stb
        PROPERTIES IMPORTED_LOCATION
        $ENV{OVR_HOME}/3rdParty/stb/lib/android/${ANDROID_ABI}/libstb.a)

add_library(app-glue
        STATIC
        ${ANDROID_NDK}/sources/android/native_app_glue/android_native_app_glue.c)

# Searches for a specified prebuilt library and stores the path as a
# variable. Because CMake includes system libraries in the search path by
# default, you only need to specify the name of the public NDK library
# you want to add. CMake verifies that the library exists before
# completing its build.

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries(
        vrsamplebase
        android
        app-glue
        vrapi
        z
        minizip
        stb
        ${LIB_LOG}
        ${LIB_EGL}
        ${LIB_GLES})

# The following linker file is crucial, see: https://github.com/android/ndk/issues/381
# Otherwise the linker will strip this as "unused" since this is a static library, but we
# need to keep it around as the interface for JNI.
set(CMAKE_SHARED_LINKER_FLAGS "${CMAKE_SHARED_LINKER_FLAGS} -u ANativeActivity_onCreate")
