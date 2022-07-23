cmake_minimum_required(VERSION 3.18)
project(stockfishlib VERSION 0.0.1)

set (CXX_STANDARD 17)


# Include stockfish NNUE
set (NNUE_NAME nn-ad9b42354671.nnue)
file(DOWNLOAD https://tests.stockfishchess.org/api/nn/${NNUE_NAME} ./src/main/cpp/${NNUE_NAME} )
file(COPY ${NNUE_NAME} DESTINATION ${CMAKE_BINARY_DIR})

file(GLOB_RECURSE stockfishCppPaths "./stockfish/src/*.cpp")
file(GLOB_RECURSE bridgeCppPaths "./bridge/*.cpp")

add_library(
        stockfishlib
        SHARED
        ${stockfishCppPaths}
        ${bridgeCppPaths}
)

target_include_directories(
        stockfishlib
        PRIVATE
        "./stockfish/src"
)